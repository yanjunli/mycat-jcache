package io.mycat.mcache.command;

import io.mycat.mcache.conn.handler.BinaryProtocol;

/**
 * 命令类型  同时支持 二进制 /文本协议查找
 * @author lyj
 *
 */
public enum CommandType {
	
	get(BinaryProtocol.OPCODE_GET),
	set(BinaryProtocol.OPCODE_SET),
	add(BinaryProtocol.OPCODE_ADD),
	replace(BinaryProtocol.OPCODE_REPLACE),
	delete(BinaryProtocol.OPCODE_DELETE),
	increment(BinaryProtocol.OPCODE_INCREMENT),
	decrement(BinaryProtocol.OPCODE_DECREMENT),
	quit(BinaryProtocol.OPCODE_QUIT),
	flush(BinaryProtocol.OPCODE_FLUSH),
	getq(BinaryProtocol.OPCODE_GETQ),
	noop(BinaryProtocol.OPCODE_NOOP),
	version(BinaryProtocol.OPCODE_VERSION),
	getk(BinaryProtocol.OPCODE_GETK),
	getkq(BinaryProtocol.OPCODE_GETKQ),
	append(BinaryProtocol.OPCODE_APPEND),
	prepend(BinaryProtocol.OPCODE_PREPEND),
	stat(BinaryProtocol.OPCODE_STAT),
	auth_list(BinaryProtocol.OPCODE_AUTH_LIST),
	start_auth(BinaryProtocol.OPCODE_START_AUTH),
	auth_steps(BinaryProtocol.OPCODE_AUTH_STEPS),
	touch(BinaryProtocol.OPCODE_TOUCH);
	
	CommandType(byte type){
		this.type = type;
	}
	
	private Byte type;
	
	public Byte getByte(){
		return this.type;
	}
	
	public static CommandType getType(Byte type){
		for(CommandType tp:CommandType.values()){
			if(tp.type.equals(type)){return tp;}
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(1 << 1);
	}
}
