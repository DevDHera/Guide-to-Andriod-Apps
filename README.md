# Guide to Android Apps :sunglasses:

This project aims to cover the basics of Android Apps by creating your very own `News Portal`.


## What we will use :astonished:

Following is our tech stack.

* Java (:unamused: Sorry, No `Kotlin`)
* Retrofit 
* Glide
* GSON
* Prettytime

We will use [NewsApi](https://newsapi.org/) as news feeder.

## Look at the Codebase

```java
public static Retrofit getApiClient() {

    if (retrofit == null) {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(getUnsafeOkHttpClient().build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }
    return retrofit;
}
```

## Steps to Run

Simply clone the project using the following command.

```sh
git clone https://github.com/DevDHera/Guide-to-Andriod-Apps.git
```
Or you can checkout from the VCS using the **Android Studio**.


## Now what :question:

Find bugs :beetle: and create issues :blush:.
  