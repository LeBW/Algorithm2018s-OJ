# 南京大学 算法设计与分析 2018春 OJ

## 1. 最大子序列和问题
### 题目描述
给定一整数序列 a1, a2, …, an，求 a1\~an 的一个子序列 ai\~aj，使得从 ai 到 aj 的和最大。
只需要求出最大子序列的和，而不需要求出最大的那个序列。

### 输入
一组整数，数字和数字之间以空格隔开。

### 输出
该整数序列中最大子序列的和

#### 样例输入
	-2 11 -4 13 -5 -2

#### 样例输出
	20
	
[Solution](https://github.com/LeBW/Algorithm2018s-OJ/blob/master/src/MaxSubsequence.java)

## 2. 中位数附近2k+1个数
### 题目描述
给出一串整型数 a1,a2,...,an 以及一个较小的常数 k，找出这串数的中位数 m 和最接近 m 的小于等于 m 的 k 个数，以及最接近 m 的大于等于 m 的 k 个数。将这 2k+1 个数按升序排序后输出。

中位数定义：如果数串的大小是偶数 2j，中位数是从小到大排列的第 j 个数；如果数串的大小是奇数 2j+1，中位数是从小到大排列的第 j+1 个数。

### 输入
第一行是 k 的值和数串的长度 n。

第二行是以空格隔开的 n 个整型数，最后一个数后面有空格。

### 输出
按升序排列的 2k+1 个数，以空格分开，最后一个数后面没有空格。结果可能出现重复的数。

#### 样例输入
	2 10
	7 2 5 7 2 10 7 7 13 15

#### 样例输出
	5 7 7 7 7
	
[Solution](https://github.com/LeBW/Algorithm2018s-OJ/blob/master/src/MedianNearBy.java)

## 3. 动态中位数问题
### 题目描述
输入一组整数a1, a2, …, an ，每输入一个整数，输出到此时为止的中位数。

中位数定义：如果数串的大小是偶数 2j，中位数是从小到大排列的第 j 个数；如果数串的大小是奇数 2j+1，中位数是从小到大排列的第 j+1 个数。

### 输入
一组整数，数字和数字之间以空格隔开。

### 输出
一组整数，数字和数字之间以空格隔开。最后一个数后面也有空格。

第 i 个输出的整数，是前 i 个输入的中位数。

#### 样例输入
	-18 -2 14 -20 -6 7 2 14 11 6 

#### 样例输出
	-18 -18 -2 -18 -6 -6 -2 -2 2 2 
	
[Solution](https://github.com/LeBW/Algorithm2018s-OJ/blob/master/src/RunningMedian.java)

## 4. 变位词
### 题目描述
变位词是指由相同的字母组成的单词，如eat、tea是变位词。本次问题给出一串单词，你需要找到所有的变位词。

### 输入
输入由两行组成：第一行是所有单词的总数，第二行是由空格分隔的单词列表。两行末尾都有空格。

注：为防歧义，输入的单词都是小写

### 输出
这次需要大家先输出一个字符串，它是“我已阅读关于抄袭的说明”的汉语拼音.输出此行的提交我们将认为已经完全阅读并了解了“关于抄袭的说明”公告.

第二行是变位词组的个数，后面是所有的变位词。每个输出的变位词占一行。一组变位词只需要输出一个字典序最小的代表即可，如eat、tea中eat字典序小于tea，所以输出eat。变位词与变位词也按照字典序从小到大排列，如eat和el中eat字典序小于el所以eat在el前面。

输出的每一行最后都没有空格。

提示：使用代价为`O(nlogn)`的方法。

#### 样例输入
	9
	a ew vc tea oe eat zoo el le 

#### 样例输出
	wo yi yue du guan yu chao xi de shuo ming
	2
	eat
	el

[Solution](https://github.com/LeBW/Algorithm2018s-OJ/blob/master/src/ModificationWord.java)

