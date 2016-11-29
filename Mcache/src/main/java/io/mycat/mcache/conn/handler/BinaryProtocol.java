package io.mycat.mcache.conn.handler;

/**
 * 二进制协议
 * 
 * @author liyanjun
 *
 */
public final class BinaryProtocol {

	public static final String VALUE = "VALUE";
	public static final String STATS = "STAT";
	public static final String ITEM = "ITEM";
	public static final String DELETED = "DELETED\r\n";
	public static final String SYNCED = "SYNCED\r\n";
	public static final String NOTFOUND = "NOT_FOUND\r\n";
	public static final String STORED = "STORED\r\n";
	public static final String OK = "OK\r\n";
	public static final String END = "END\r\n";
	public static final String ERROR = "ERROR\r\n";
	public static final String CLIENT_ERROR = "CLIENT_ERROR\r\n";
	public static final int COMPRESS_THRESH = 30720;
	public static final String SERVER_ERROR = "SERVER_ERROR\r\n";
	public static final byte[] B_RETURN = "\r\n".getBytes();
	public static final byte[] B_END = "END\r\n".getBytes();
	public static final byte[] B_NOTFOUND = "NOT_FOUND\r\n".getBytes();
	public static final byte[] B_DELETED = "DELETED\r\r".getBytes();
	public static final byte[] B_STORED = "STORED\r\r".getBytes();
	public static final byte MAGIC_REQ = -128;
	public static final byte MAGIC_RESP = -127;
	public static final int F_COMPRESSED = 2;
	public static final int F_SERIALIZED = 8;
	public static final int STAT_NO_ERROR = 0;
	public static final int STAT_KEY_NOT_FOUND = 1;
	public static final int STAT_KEY_EXISTS = 2;
	public static final int STAT_VALUE_TOO_BIG = 3;
	public static final int STAT_INVALID_ARGUMENTS = 4;
	public static final int STAT_ITEM_NOT_STORED = 5;
	public static final int STAT_UNKNOWN_COMMAND = 129;
	public static final int STAT_OUT_OF_MEMORY = 130;
	public static final byte OPCODE_GET = 0;
	public static final byte OPCODE_SET = 1;
	public static final byte OPCODE_ADD = 2;
	public static final byte OPCODE_REPLACE = 3;
	public static final byte OPCODE_DELETE = 4;
	public static final byte OPCODE_INCREMENT = 5;
	public static final byte OPCODE_DECREMENT = 6;
	public static final byte OPCODE_QUIT = 7;
	public static final byte OPCODE_FLUSH = 8;
	public static final byte OPCODE_GETQ = 9;
	public static final byte OPCODE_NOOP = 10;
	public static final byte OPCODE_VERSION = 11;
	public static final byte OPCODE_GETK = 12;
	public static final byte OPCODE_GETKQ = 13;
	public static final byte OPCODE_APPEND = 14;
	public static final byte OPCODE_PREPEND = 15;
	public static final byte OPCODE_STAT = 16;
	public static final byte OPCODE_AUTH_LIST = 32;
	public static final byte OPCODE_START_AUTH = 33;
	public static final byte OPCODE_AUTH_STEPS = 34;
	public static final byte AUTH_FAILED = 32;
	public static final byte FURTHER_AUTH = 33;
	public final byte[] BLAND_DATA_SIZE = "       ".getBytes();
	public static final int MARKER_BYTE = 1;
	public static final int MARKER_BOOLEAN = 8192;
	public static final int MARKER_INTEGER = 4;
	public static final int MARKER_LONG = 16384;
	public static final int MARKER_CHARACTER = 16;
	public static final int MARKER_STRING = 32;
	public static final int MARKER_STRINGBUFFER = 64;
	public static final int MARKER_FLOAT = 128;
	public static final int MARKER_SHORT = 256;
	public static final int MARKER_DOUBLE = 512;
	public static final int MARKER_DATE = 1024;
	public static final int MARKER_STRINGBUILDER = 2048;
	public static final int MARKER_BYTEARR = 4096;
	public static final int MARKER_OTHERS = 0;
	
	public static final byte PROTOCOL_BINARY_RAW_BYTES = 0;
	
	
	public static final short noerror         = 0x0000;//	No error
	public static final short keyNotFound     = 0x0001;//	Key not found
	public static final short keyExists       = 0x0002;//	Key exists
	public static final short valueTooLarge   = 0x0003;//	Value too large
	public static final short inValidArgs     = 0x0004;//	Invalid arguments
	public static final short notStored       = 0x0005;//	Item not stored
	public static final short crnonValue      = 0x0006;//	Incr/Decr on non-numeric value.
	public static final short vbucketAnother  = 0x0007;//	The vbucket belongs to another server
	public static final short autherror       = 0x0008;//	Authentication error
	public static final short authContinue    = 0x0009;//	Authentication continue
	public static final short unknownCmd      = 0x0081;//	Unknown command
	public static final short outOfMemory     = 0x0082;//	Out of memory
	public static final short notSupported    = 0x0083;//	Not supported
	public static final short interError      = 0x0084;//	Internal error
	public static final short busy            = 0x0085;//	Busy
	public static final short tmpfail         = 0x0086;//	Temporary failure

}
