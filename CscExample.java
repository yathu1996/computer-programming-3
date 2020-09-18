public class CscExample{
	
	int questionNO;
	String category;
	String text;

}
public void setQuestionNo(int questionNO){
	this.questionNO =questionNO;
	
}
public void setQCategory(String category){
	this.category==category;
	
}
public void setText(String text){
	this.text==text;
	
}
public int getQuestionNo(){
	return questionNO;
	
}
public String getCategory(){
	return category;
	
}
public String getText(){
	return text;
	
}

void addQuestion(CscExample qu)
{
questionNo=questionNo +qu;
}
void removeQuestion(CscExample re)
{
  questionNo=questionNo -re;
}