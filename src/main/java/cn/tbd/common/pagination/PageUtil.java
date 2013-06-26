package cn.tbd.common.pagination;

/**
 * 
 */
public class PageUtil {

	/**
	 * 
	 * @param pageNumber
	 * @param pageSize
	 * @return
	 */
	public static int getPageStart(int pageNumber, int pageSize) {
		return (pageNumber - 1) * pageSize;
	}

	/**
	 * 
	 * @param totalCount
	 * @param pageNumber: start from 1
	 * @return
	 */
	public static int getPageStart(int totalCount, int pageNumber, int pageSize) {
		int start = (pageNumber - 1) * pageSize;
		if (start >= totalCount) {
			start = 0;
		}

		return start;
	}

}
