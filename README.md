#Steps to reproduce:
* Build: `./gradlew clean build -Dquarkus.package.type=native`
* Start `./build/code-with-quarkus-1.0.0-SNAPSHOT-runner`
* Open `http://localhost:8080/hello-resteasy`

#Error
```bash
2021-04-20 11:44:54,335 INFO  [io.quarkus] (main) code-with-quarkus 1.0.0-SNAPSHOT native (powered by Quarkus 1.13.2.Final) started in 0.017s. Listening on: http://0.0.0.0:8080
2021-04-20 11:44:54,342 INFO  [io.quarkus] (main) Profile prod activated. 
2021-04-20 11:44:54,342 INFO  [io.quarkus] (main) Installed features: [cdi, config-yaml, kotlin, resteasy]
2021-04-20 11:45:00,157 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-1) HTTP Request to /hello-resteasy failed, error id: fe02fce4-adc1-4961-9b7f-c7f79c11964f-1: org.jboss.resteasy.spi.UnhandledException: java.util.NoSuchElementException: SRCFG00014: Property segments.items is required but the value was not found or is empty
	at org.jboss.resteasy.core.ExceptionHandler.handleException(ExceptionHandler.java:381)
	at org.jboss.resteasy.core.SynchronousDispatcher.writeException(SynchronousDispatcher.java:218)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:519)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$invoke$4(SynchronousDispatcher.java:261)
	at org.jboss.resteasy.core.SynchronousDispatcher.lambda$preprocess$0(SynchronousDispatcher.java:161)
	at org.jboss.resteasy.core.interception.jaxrs.PreMatchContainerRequestContext.filter(PreMatchContainerRequestContext.java:364)
	at org.jboss.resteasy.core.SynchronousDispatcher.preprocess(SynchronousDispatcher.java:164)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:247)
	at io.quarkus.resteasy.runtime.standalone.RequestDispatcher.service(RequestDispatcher.java:73)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.dispatch(VertxRequestHandler.java:138)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler.access$000(VertxRequestHandler.java:41)
	at io.quarkus.resteasy.runtime.standalone.VertxRequestHandler$1.run(VertxRequestHandler.java:93)
	at org.jboss.threads.EnhancedQueueExecutor$Task.run(EnhancedQueueExecutor.java:2415)
	at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1452)
	at org.jboss.threads.DelegatingRunnable.run(DelegatingRunnable.java:29)
	at org.jboss.threads.ThreadLocalResettingRunnable.run(ThreadLocalResettingRunnable.java:29)
	at java.lang.Thread.run(Thread.java:834)
	at org.jboss.threads.JBossThread.run(JBossThread.java:501)
	at com.oracle.svm.core.thread.JavaThreads.threadStartRoutine(JavaThreads.java:519)
	at com.oracle.svm.core.posix.thread.PosixJavaThreads.pthreadStartRoutine(PosixJavaThreads.java:192)
Caused by: java.util.NoSuchElementException: SRCFG00014: Property segments.items is required but the value was not found or is empty
	at io.smallrye.config.SmallRyeConfig.getValue(SmallRyeConfig.java:234)
	at io.quarkus.arc.runtime.config.ConfigPropertiesProducer.produceSegmentsConfiguration(ConfigPropertiesProducer.zig:69)
	at io.quarkus.arc.runtime.config.ConfigPropertiesProducer_ProducerMethod_produceSegmentsConfiguration_004ce2013420739b954a774ad0e6cda8ff31bb4d_Bean.create(ConfigPropertiesProducer_ProducerMethod_produceSegmentsConfiguration_004ce2013420739b954a774ad0e6cda8ff31bb4d_Bean.zig:243)
	at io.quarkus.arc.runtime.config.ConfigPropertiesProducer_ProducerMethod_produceSegmentsConfiguration_004ce2013420739b954a774ad0e6cda8ff31bb4d_Bean.get(ConfigPropertiesProducer_ProducerMethod_produceSegmentsConfiguration_004ce2013420739b954a774ad0e6cda8ff31bb4d_Bean.zig:273)
	at io.quarkus.arc.runtime.config.ConfigPropertiesProducer_ProducerMethod_produceSegmentsConfiguration_004ce2013420739b954a774ad0e6cda8ff31bb4d_Bean.get(ConfigPropertiesProducer_ProducerMethod_produceSegmentsConfiguration_004ce2013420739b954a774ad0e6cda8ff31bb4d_Bean.zig:308)
	at org.acme.GreetingResource_Bean.create(GreetingResource_Bean.zig:148)
	at org.acme.GreetingResource_Bean.create(GreetingResource_Bean.zig:170)
	at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:96)
	at io.quarkus.arc.impl.AbstractSharedContext.access$000(AbstractSharedContext.java:14)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:29)
	at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:26)
	at io.quarkus.arc.impl.LazyValue.get(LazyValue.java:26)
	at io.quarkus.arc.impl.ComputingCache.computeIfAbsent(ComputingCache.java:69)
	at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:26)
	at org.acme.GreetingResource_Bean.get(GreetingResource_Bean.zig:202)
	at org.acme.GreetingResource_Bean.get(GreetingResource_Bean.zig:218)
	at io.quarkus.arc.impl.ArcContainerImpl.beanInstanceHandle(ArcContainerImpl.java:430)
	at io.quarkus.arc.impl.ArcContainerImpl.beanInstanceHandle(ArcContainerImpl.java:443)
	at io.quarkus.arc.impl.ArcContainerImpl$1.get(ArcContainerImpl.java:266)
	at io.quarkus.arc.impl.ArcContainerImpl$1.get(ArcContainerImpl.java:263)
	at io.quarkus.arc.runtime.BeanContainerImpl$1.create(BeanContainerImpl.java:35)
	at io.quarkus.resteasy.common.runtime.QuarkusConstructorInjector.construct(QuarkusConstructorInjector.java:54)
	at org.jboss.resteasy.plugins.server.resourcefactory.POJOResourceFactory.createResource(POJOResourceFactory.java:71)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:386)
	at org.jboss.resteasy.core.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:68)
	at org.jboss.resteasy.core.SynchronousDispatcher.invoke(SynchronousDispatcher.java:492)
	... 17 more
```
