# PullDownView

## 效果

  <img src="https://github.com/w4lle/PullDownView/blob/master/demo.gif">


--
## 使用方法

引用

>  compile 'com.w4lle.library:pull-down-view:1.0.0'

```java
<com.w4lle.library.PullDownView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="300dp"
            android:orientation="vertical">

            <ImageView
                android:id="@+id/image"
                android:scaleType="center"
                android:background="@drawable/back"
                android:layout_width="match_parent"
                android:layout_height="match_parent" />
        </LinearLayout>


        <LinearLayout
            android:layout_marginTop="200dp"
            android:layout_width="match_parent"
            android:background="@android:color/white"
            android:id="@+id/container"
            android:orientation="vertical"
            android:layout_height="600dp">
        </LinearLayout>

    </RelativeLayout>

</com.w4lle.library.PullDownView>
```




## 协议

>  /*
 * Copyright (C) 2015 w4lle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
