package 第九章.实验题1;

import java.util.HashMap;
import java.util.Map;

public class 操作账户 implements 操作账户的接口 {
	private Map<String, 账户> uu;
	public  操作账户() {
		
		uu=new HashMap<String,账户>();
	}

	@Override
	public void 存钱(String id, double b) throws ec {
		账户 z = uu.get(id);
		if (z == null) {
			throw new ec("没有这个用户");
		}
		if (z != null) {
			double a = z.getCunkuai();
			double c = a + b;
			z.setCunkuai(c);
			uu.put(id,z);

		}

	}

	@Override
	public void 取钱(String id, double b) throws ec {
		账户 z = uu.get(id);
		if (z == null) {
			throw new ec("没有这个账户");

		}
		if (z != null) {
			double c = z.getCunkuai()

			;
			if (c < b) {
				throw new ec("账户余额不足");

			} else {
				double d = c - b;
				z.setCunkuai(d);
				uu.put(id,z);
			}

		}

	}

	@Override
	public void 存钱() {
		// TODO Auto-generated method stub

	}

	@Override
	public void 取钱() {
		// TODO Auto-generated method stub

	}

}
