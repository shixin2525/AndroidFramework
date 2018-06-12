# AndroidFramework
MVC
Model:数据模型，获取数据
View:XML布局和自定义VIEW
Controller:Activity

原理:当view层发出一个用户事件，controller调用model层更新数据,model更新完数据后直接显示再UI上。
弊端：1.controller既处理业务逻辑，又处理view，导致controller过于臃肿
                2.view和model是相互可知的，这意味着两层之间存在耦合。


MVP
Model:数据模型，获取数据
View:XML布局和自定义VIEW和Activity
Pressenter:负责完成view与model之间的交互和业务逻辑


原理:当view层发出一个用户事件，view通知pressenterl层，pressenter再通知model层,最后pressenter再将最终的结果返回给view层。

特点：view与model完全解耦，pressenter处理逻辑，view只负责展示view
弊端：需要创建大量的类和接口，略显麻烦



MVVM
Model:数据模型，获取数据
View:XML布局和自定义VIEW
ViewModel:相当于mvp的pressenter,将view和model联系起来


原理:当view层发出一个用户事件,ViewModel通知model层更新数据，model数据更新后，viewmodel通知view更新，与mvp不同的是，view与viewmodel的联系是通过databinding实现的

特点：Android中实现mvvm完全依赖于databinding
弊端：mvvm中数据是双向绑定的，这样不利于代码重用,数据绑定使得bug很难被调试










