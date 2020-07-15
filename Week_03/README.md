递归
递归三要素：
	1、明确函数功能。
		例如计算n的阶层，定义函数出入参数及名称
		int f(int n){

		}
	2、寻找递归介绍条件
		寻找递归结束返回结果的条件。
		int f(int n){
		   //当n=1时 返回结果
 		   if(n == 1){
     		   return 1;
   		 }
		}
	3、找出函数的等价关系式
		缩小参数的范围，使原函数的结果不变int f(int n){
    		if(n <= 2){
   		     return n;
   		 }
 		   // 把 f(n) 的等价操作写进去
   		 return f(n-1) * n;
		}

代码模板
public void recur(int level, int param) { 

  // terminator 递归终结条件
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }

  // process current logic 处理当前层逻辑
  process(level, param); 

  // drill down 下探下一层
  recur( level: level + 1, newParam); 

  // restore current status 清理当前层
 
}

递归要点
	1、避免人肉递归及手洗状态树，直接对函数本身着手。
	2、找到最近最简方法、将其拆分成可重复解决的问题（重复子问题）
	3、数学归纳法思维。
	