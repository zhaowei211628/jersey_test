package jersey.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Service;

import jersey.service.iface.IMessageService;
import model.Message;

@Service("messageService")
public class MessageServiceImpl implements IMessageService {

	public Message convertMessage(Message msg) {
		// TODO Auto-generated method stub
				msg.setId(UUID.randomUUID().toString());
				SimpleDateFormat smp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				msg.setPostedAt(smp.format(new Date()));
				System.out.println(msg.getPostedAt());
				return msg;
	}

	
	
}
