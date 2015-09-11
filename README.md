# PullDownView


  <img src="https://github.com/w4lle/PullDownView/blob/master/pulldownLayout.gif">


--
## Usage

### Gradle

>  compile 'com.w4lle.library:pull-down-layout:1.0.2'

### XML

```
<com.w4lle.library.PullDownView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:is_change_speed="false"
    app:pull_down_height="30dp"
    app:pull_up_height="30dp"
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
### JAVA
```
 pullDownView.setOnPullChangeListerner(new PullDownView.OnPullChangeListerner() {
            @Override
            public void onPullDown() {
                Toast.makeText(MainActivity.this, "onPullDown", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPullUp() {
                Toast.makeText(MainActivity.this, "onPullUp", Toast.LENGTH_SHORT).show();
            }
        });
```

## Custom
```
pull_down_height  下拉触发阀值  DEFAULT 50
pull_up_height  上拉触发阀值  DEFAULT 50
is_change_speed  底图上推滑动速度是否区别速度 DEFAULT false
```

## ChangeLog

v1.0.2 add styleable

v1.0.1 add OnPullChangeListener



## License

 /*
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
