# AndroidFramework
<br></br>
<br></br>
<h3>1.MVC</h3>


----------


Model:数据模型，获取数据
View:XML布局和自定义VIEW
Controller:Activity

<h5>原理:</h5>当view层发出一个用户事件，controller调用model层更新数据,model更新完数据后直接显示再UI上。
<h5>弊端：</h5>1.controller既处理业务逻辑，又处理view，导致controller过于臃肿
                2.view和model是相互可知的，这意味着两层之间存在耦合。
<br></br>
<br></br>
<br></br>

<h3>2.MVP</h3>


----------


Model:数据模型，获取数据
View:XML布局和自定义VIEW和Activity
Pressenter:负责完成view与model之间的交互和业务逻辑


<h5>原理:</h5>当view层发出一个用户事件，view通知pressenterl层，pressenter再通知model层,最后pressenter再将最终的结果返回给view层。

<h5>特点：</h5>view与model完全解耦，pressenter处理逻辑，view只负责展示view
<h5>弊端：</h5>需要创建大量的类和接口，略显麻烦  
  
  
 

   
<br></br>
<br></br>
<br></br>                                                                                                        
<h3>3.MVVM</h3>

----------


Model:数据模型，获取数据
View:XML布局和自定义VIEW
ViewModel:相当于mvp的pressenter,将view和model联系起来


<h5>原理:</h5>当view层发出一个用户事件,ViewModel通知model层更新数据，model数据更新后，viewmodel通知view更新，与mvp不同的是，view与viewmodel的联系是通过databinding实现的

<h5>特点：</h5>Android中实现mvvm完全依赖于databinding
<h5>弊端：</h5>mvvm中数据是双向绑定的，这样不利于代码重用,而且数据绑定使得bug很难被调试
















