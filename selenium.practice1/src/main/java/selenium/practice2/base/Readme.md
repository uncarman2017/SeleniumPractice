##pratice 1
###1.使用WebDriver.findElement查找元素

**WebDriver.findElement()**
**WebDriver.get()**
**WebDriver.manage()**

###2.WebElement的方法
- getAttribute()
- isEnabled()
- sendKeys()
- isSelected()
- selectByValue()

###3.By方法定位元素
- By.xpath
- By.id
- By.name
- By.tagName
- By.className
- By.linkText
- By.partialLinkText
- By.cssSelector


###4.执行JS脚本
**JavascriptExecutor.executeScript()**

###5.WebElement对应HTML元素的主要方法
- 文本框
    - sendKeys
    - clear
    - getAttribute
- 单选框
    - click
    - clear
    - isSelected
- 多选框
    - click
    - clear
    - isSelected
    - isEnabled
- 按钮
    - click
    - isEnabled
- 表单
    - submit（以url后？附加参数形势）
    - 上传文件
    - input以sendkey方式
    - autoIt
- 下拉框
    - selenium自带select list = new select(locator)类
    - selectByText, selectByValue, selectByIndex
    - deselectAll, deselectByValue, deselectByIndex, deselectByVisibleText
    - getAllSelectedOptions, getFirstSelectedOption
- 鼠标
    - Actions action = new Actions(driver)
    - Action.click().**perform()**每次都要有perform
    - contextClick().**perform()**, doubleClick()..**perform()**, moveToElement()..**perform()**
- 窗口\体
    - iframe, 弹窗
    - switchTo(), getWindowHandles()
- 等待函数
    - 强制等待--sleep死等
    - 显示等待--规定时间，一旦找到立刻下步
    - 隐式等待--相当于全局
    
 
