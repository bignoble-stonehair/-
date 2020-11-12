# 世界で闘うプログラミング力を鍛える本
アルゴリズムとデータ構造の練習

### 1　"配列と文字列"の解法
#### 1.1_v1
二重ループ

時間的計算量はO(N^2)

空間的計算量はO(N)

#### 1.1_v2
ascii codeを前提にすれば128文字を超えた時点で重複あり(鳩ノ巣原理ってやつ？)

時間的計算量はO(N)

空間的計算量はO(1)

#### 1.2_v1
文字列をソートして一致しているかで同じかどうかを調べる

一番わかりやすくて（pythonで書くと）_実装も簡単

時間的計算量はpythonのソートだと確かO(NlogN)かな？

空間的計算量はO(N)

#### 1.2_v2
同じ文字数が一致するか調べる

時間的計算量はO(N)

空間的計算量はO(1)

#### 1.3_v1
文字列操作はpythonで書くと楽

#### 1.3_v2
pythonだと簡単だったのでjavaで同じものを書いてみた

javaだと配列操作になる

大変

#### 1.4_v1
オリジナル

計算量的にはversionで変わることなくO(N)

同じ文字をペアで打ち消していく。最終的にすべて打ち消すか一文字残るかのいづれかの状況が回文の成立する条件になる

#### 1.4_v2
本で紹介されてたビットを用いたフラグ管理

こっちの方が簡単で美しいかも

#### 1.5_v1
計算量的にはO(N)

pythonってi++使えないんだっけ？

配列使うときは配列のrangeに注意（戒め）

#### 1.5_v2
本に載っていた別解のほう

計算量的には変わらないけど、こちらの方が短くていい気がする

#### 1.6_v1
pythonで何も考えずに書いていたけど、文字列の初期化は=""だし、int型から文字列へのキャストstr()を忘れてるし、実行できないことがたくさんあった

反省

#### 1.7_v1
行列を９０度回転って行を上下逆にしてから転置すればいいんだってことが分かりました

#### 1.8_v1
いづれにしろ全部調べなくてはいけないから、時間的計算量はO(NM)でかわらない

空間的には工夫の仕様がある

今回はスタックを使ってみたけど、よくよく考えたら列、行ごとのTRUE/FALSEでいい話


#### 1.9_v1
関数使用は１回の制限付き

これ頭の体操になるな

解けなかったけど
