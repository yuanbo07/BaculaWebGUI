package utils;

public class Manual {
	
	/* Device */
	
	public static String getDeviceLabelMediaInfo(){
		String info = "Let Bacula label unlabeled media";
		return info ;
	}
	
	public static String getDeviceArchiveDeviceInfo(){
		String info = "Full absolute path to the directory where backup files will be placed. Ex : /bacula/bacula/backup/lxsauve";
		return info ;
	}
	
	/* Pool */
	
	public static String getPoolLabelFormatInfo(){
		String info = "Ex. ${Poolname}-${Year}-${Month:p/2/0/r}-${Day:p/2/0/r}";
		return info ;
	}
	
	public static String getPoolVolumeRetentionInfo(){
		String info = "Ex. 60 days";
		return info ;
	}
	
	public static String getPoolMaxVolumeBytes(){
		String info = "Ex. 50G";
		return info ;
	}
	
	public static String getPoolMaxVolume(){
		String info = "Ex. 4";
		return info ;
	}
	
	public static String getPoolMaxVolumeJob(){
		String info = "Ex. 1";
		return info ;
	}
	
	/* Storage */
	
	public static String getStorageIpInfo(){
		String info = "Change if the SD daemon is not on localhost. Default value : "+Constant.getLocalhost_ip();
		return info ;
	}
	
	/* FileSet */
	
	public static String getFilesetBackupPath(){
		String info = "Devide paths by comma. ex : /usr/local, /home";
		return info ;
	}
	
	public static String getFilesetExcludePath(){
		String info = "Devide paths by comma. ex : /usr/local/apache*, /var/log. Leave this field blank if no path is to be excluded.";
		return info ;
	}
	
	/* JobDef */
	
	public static String getJobDefPriorityInfo(){
		String info = "The higher the number, the lower the job priority. The priority only affects waiting jobs that are queued to run. Default value : 10";
		return info ;
	}
	
	/* Client */
	
	public static String getClientFileRetentionInfo(){
		String info = "The File Retention defines the length of time that Bacula will keep File records in the Catalog database after the End time of the Job corresponding to the File records. "
				+ "When this time period expires, and if AutoPrune is set to yes Bacula will prune (remove) File records that are older than the specified File Retention period. "+
				"This affects only records in the catalog database. It does not affect your archive backups."+
				"The default is 60 days.";
		return info ;
	}
	
	/* Search */
	
	public static String getSearchFilenameInfo(){
		String info = "Support name sub-string match";
		return info ;
	}
	
	/* Wizard */
	
	public static String getWizardOptionInfo(){
		String info = "Support name sub-string match";
		return info ;
	}
	
	
	/* Job */
	
	public static String getJobScheduleInfo(){
		String info = "This option will disable and overwrite the schedule already defined in JobDefs";
		return info ;
	}
	
	public static String getJobJobDefInfo(){
		String info = "A Job can either be defined by an existing JobDefs, or by using advanced options. Note: options defined in Job will overwrite the same definitions in JobDefs.";
		return info ;
	}
	
	/* Schedule */
	
	public static String getScheduleRunInfo(){
		String info = "Devide multiple runs by comma. ex : Run = Full 1st sun at 23:05, Run = Differential 2nd-5th sun at 23:05";
		return info ;
	}

	public static String getWizardExtraBackupPathInfo() {
		String info = "If you have extra path to back up besides /home, /etc and /usr/local, put it here. Devide multiple paths by comma. ex : /bin, /usr/bin";
		return info ;
	}
	
	public static String getWizardExtraExcludePathInfo() {
		String info = "If you have extra path to exclude besides /home/apachelogs, /usr/local/apache*/logs, put it here. Devide multiple paths by comma. ex : /glassfish/logs, /home/logs";
		return info ;
	}
}