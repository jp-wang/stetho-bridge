# Stetho Bridge

### Introduction

[Stetho-bridge](https://github.com/jp-wang/stetho-bridge) is an simple android library to setup a bridge for any project who wants to use [Stetho](http://facebook.github.io/stetho/) more easily.

It gives you a simple way to enable and disable Stetho between `debug` and `release` build.

### Usage

```gradle
  // Gradle dependency on Stetho 
  dependencies { 
    compile 'io.jp.stetho:stetho-bridge:1.0.3' 
  } 
```

```maven
  <dependency>
    <groupid>io.jp.stetho</groupid> 
    <artifactid>stetho-bridge</artifactid> 
    <version>1.0.3</version> 
  </dependency> 
```

Integrating with stetho-bridge is same as stetho which is intended to be seamless and straightforward for most existing Android applications. There is a simple initialization step which occurs in your Application class:

```java
public class MyApplication extends Application {
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
  }
}
```

If you are using HttpURLConnection, you can use StethoURLConnection to assist with integration though you should be aware that there are some caveats with this approach

```java
...
byte[] requestBody = ...;
HttpURLConnection conn = ...;
... //setup connection here, e.g.,conn.setReadTimeout(READ_TIMEOUT_MS);
    //                            conn.setConnectTimeout(CONNECT_TIMEOUT_MS);
    //                            conn.setRequestMethod(request.method.toString());
stethoURLConnection.preConnect(conn, requestBody);
...
conn.connect();
...
stethoURLConnection.postConnect(conn);
...
InputStream rawStream = conn.getInputStream();
rawStream = stethoManager.interpretResponseStream(rawStream); //Delegate the original input stream
...

```


### Features
