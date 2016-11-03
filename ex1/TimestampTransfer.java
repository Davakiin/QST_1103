package No1;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 题目要求：
 * 0. 在个人仓库下，创建分支yourname_ex1
 * 1. 在个人分支下，修改Answers.md文件，里面填入当输入为'2016-11-11 11:11:11'时，输出的值是多少
 * 2. 对代码进行注释，说明每行代码的作用，把代码提交到个人分支下
 * 3. 创建pull request，与主仓库的master分支对比
 */
public class TimestampTransfer {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置inputformat时间的格式
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//设置outputFormat时间的格式
		while (scanner.hasNext()){
			String line = scanner.nextLine();//定义变量line为输入的一行数据
			Date lineDate = null;//定义时间戳变量
			long lineTimestamp;
			try {
				lineDate = inputFormat.parse(line);//将输入的line转换为时间戳
				lineTimestamp = lineDate.getTime();//使用gettime()方法来计算1970年一月一日至今有多少时间并返回给linTimestamp
				System.out.println(outputFormat.format(lineDate) + " to " + lineTimestamp);
				//lineDate = line = 2016-11-11 11:11:11 
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
