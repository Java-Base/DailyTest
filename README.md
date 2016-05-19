# DailyTest
日常测试

1. 启动WEB项目, WEB容器会去读取它的配置文件web.xml, 读取<listener>和<context-param>两个节点.
2. 紧接着, 容器创建一个ServletContext, 这个WEB项目的所有部分都将共享这个上下文.
3. 容器将<context-param>转换为键值对, 并交给ServletContext.
4. 容器创建<listener>中的类实例, 创建监听器
