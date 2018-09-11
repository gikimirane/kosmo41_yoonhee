package com.study.jsp.command;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.jsp.BDao;
import com.study.jsp.BDto;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
	{
		String bId = request.getParameter("bId");
		
		BDao dao = BDao.getInstance();
		BDto dto = dao.contentView(bId);
		
		String filename = dto.getbFilename();
		String uploadFileName = request.getRealPath("/upload")+"/"+ filename;
		
		File uploadfile = new File (uploadFileName);
		if(uploadfile.exists()&& uploadfile.isFile()) {
			uploadfile.delete();
		}
		
		dao.delete(bId);
		return;
	}

}
