/*
 *  文件创建时间： 2016年11月29日
 *  文件创建者: tangww
 *  所属工程: JCache
 *  CopyRights Received EMail Dev. Dept. 21CN 
 *
 *  备注: 
 */
package io.mycat.jcache.setting;

import io.mycat.jcache.enums.Protocol;

/**
 * 
 * 类功能描述：TODO
 * @author <a href="mailto:tangww@corp.21cn.com">tangww</a>
 * @version newEDM
 * @since 2016年11月29日 
 *
 */
public class Settings {
	public static boolean useCas = true;
	public static String access = "0700";
	public static int port = 11211;
	public static int udpport = 11211;
	public static String inter = null;
	public static long maxbytes = 64*1024*1024; //64M
	public static int maxConns = 1024;
	public static short verbose = 1;
	public static short oldestLive = 0;
	public static short oldestCas = 0;
	public static short evictToFree = 1;  /* push old items out of cache when memory runs out */
	public static String socketPath = null;
	public static boolean prealloc = true;
	public static double factor = 1.25;
	public static int chunkSize = 48; /* space for a modest key and value */
	public static int numThreads = 4; /* N workers */
	public static int numThreadsPerUdp = 0;
	public static String prefixDelimiter = ":";
	public static short detailEnabled = 0;
	public static int reqsPerEvent = 20;
	public static int backLog = 1024;
	public static int binding_protocol = Protocol.negotiatingProt.getValue();
	public static int itemSizeMax = 1024*1024; /* The famous 1MB upper limit. */
	public static int slabPageSize = 1024 * 1024; /* chunks are split from 1MB pages. */
	public static int slabChunkSizeMax = slabPageSize;
	public static boolean sasl = false;  /* SASL on/off */
	public static boolean maxConnsFast = false;
	public static boolean lruCrawler = false;
	public static int lruCrawlerSleep = 100;
	public static int lruCrawlerTocrawl = 0;
	public static boolean lruMaintainerThread = false; /* LRU maintainer background thread */
	public static int hotLruPct = 32;
	public static int warmLruPct = 32;
	public static boolean expireZeroDoesNotEvict = false;
	public static int idleTimeout = 0;
	public static short hashPowerInit = 0;
	public static boolean slabReassign = false; /* Whether or not slab reassignment is allowed */
	public static short slabAutoMove = 0; /* Whether or not to automatically move slabs */
	public static boolean shutdownCommand = false; /* allow shutdown command */
	public static int tailRepairTime = 0; /* LRU tail refcount leak repair time */
	public static boolean flushEnabled = true; /* flush_all enabled */
	public static int crawlsPerSleep = 1000;  /* Number of seconds to let connections idle */
	public static int loggerWatcherBufSize = 1024; /* size of logger's per-watcher buffer */
	public static int loggerBufSize = 1024; /* size of per-thread logger buffer */
	public static int MAX_NUMBER_OF_SLAB_CLASSES = 64;
	
	public static int POWER_SMALLEST = 1;
	public static int POWER_LARGEST = 256;
	public static int CHUNK_ALIGN_BYTES = 8;
	public static int SLAB_GLOBAL_PAGE_POOL = 0; /* magic slab class for storing pages for reassignment */
	public static String hash_algorithm; //PigBrother hash algorithm
	public static int ITEM_HEADER_LENGTH = 23;   /* item header length */
	public static boolean SLABS_ALLOC_NO_NEWPAGE = true;
	
}
