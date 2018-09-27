##pratice 2  Selenium测试驱动开发示例
Business->Handler->Page类的业务模型

###1.围绕driver的封装
**DriverBase**   封装了selenium browser driver的基类访问方法
**SelectDriver**

###2 围绕定位器的封装
**LocatorHandler**  封装了页面定位器的处理方法
**PropUtil**    封装了属性配置文件的访问方法

###3 页面级别的封装
**BasePage**  页面基类,封装了一些元素定位通用方法
**CoursePage** 慕课网课程页面元素定位示例
**LoginPage** 慕课网登录页面元素定位示例
**OrderPayPage** 慕课网订单支付页面元素定位示例
**SureOrderPage** 慕课网订单确认页面元素定位示例


