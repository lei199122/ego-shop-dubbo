// pages/pay-result/pay-result.js
import QRCode from '../../utils/weapp-qrcode.js';
var http = require('../../utils/http.js');
Page({

  /**
   * 页面的初始数据
   */
  data: {
    sts: 0,
    orderNumbers: ''
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      sts: options.sts,
      orderNumbers: options.orderNumbers,
      qrCode: options.qrcode
    });
    console.log('准备生成二维码'+this.data.qrCode);
    new QRCode('myQrcode', {
      text: this.data.qrCode,
      width: 200,
      height: 200,
      padding: 12, // 生成二维码四周自动留边宽度，不传入默认为0
      correctLevel: QRCode.CorrectLevel.L, // 二维码可辨识度
      callback: (res) => {
        console.log(res.path)
        // 接下来就可以直接调用微信小程序的api保存到本地或者将这张二维码直接画在海报上面去，看各自需求
      }
    })
    var ths = this;
    var ine = setInterval(function () {
      var params = {
        url: "/p/order/query",
        method: "GET",
        data: {
          orderNumber: ths.data.orderNumbers
        },
        callBack: function(res){
          if(res==1){
            ths.setData({
               sts:0
             })
            clearInterval(ine);
          }
        }
      };
      http.request(params);
    }, 2000)
  },
  toOrderList: function () {
    wx.navigateTo({
      url: '/pages/orderList/orderList?sts=0'
    })
  },
  toIndex: function () {
    wx.switchTab({
      url: '/pages/index/index'
    })
  },
  payAgain: function () {
    wx.showLoading({
      mask: true
    });
    var params = {
      url: "/p/order/pay",
      method: "POST",
      data: {
        payType: 1,
        orderNumbers: this.data.orderNumbers
      },
      callBack: function (res) {
        //console.log(res);
        wx.hideLoading();
        wx.requestPayment({
          timeStamp: res.timeStamp,
          nonceStr: res.nonceStr,
          package: res.packageValue,
          signType: res.signType,
          paySign: res.paySign,
          success: e => {
            //console.log("支付成功");
            wx.redirectTo({
              url: '/pages/pay-result/pay-result?sts=1&orderNum=' + orderNumbers + "&orderType=" + this.data.orderType,
            })
          },
          fail: err => {
            
          }
        })

      }
    };
    http.request(params);
  },
  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})