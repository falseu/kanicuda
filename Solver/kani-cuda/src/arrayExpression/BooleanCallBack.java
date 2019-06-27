package arrayExpression;

public class BooleanCallBack implements CallBack {
	public int depth;
	public CallBack cb;
	
	public BooleanCallBack(int depth, CallBack cb) {
		this.depth = depth;
		this.cb = cb;
	}
	
	public void call(int index, arrExpression exp) {
		exp.generate1(index, depth, cb);
	}
}