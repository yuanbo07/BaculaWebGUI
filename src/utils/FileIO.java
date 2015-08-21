package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	
	public static void createClientToConfig(String client_name, String client_ip_address, 
		String catalog, String file_retention, String autoprune){
		if(file_retention.length()==0){
			file_retention = "60 days";
		}
		try {
		BufferedWriter bw = new BufferedWriter(new FileWriter(Constant.getClients(), true));
			bw.newLine();
			bw.write("Client {");
			bw.newLine();
			bw.write("  Name = "+client_name);
			bw.newLine();
			bw.write("  Address = "+client_ip_address);
			bw.newLine();
			bw.write("  FDPort = "+Constant.getFd_port());
			bw.newLine();
			bw.write("  Catalog = "+catalog);
			bw.newLine();
			bw.write("  Password = \""+Constant.getConfig_password()+"\"");
			bw.newLine();
			bw.write("  File Retention = "+file_retention);
			bw.newLine();
			bw.write("  AutoPrune = "+autoprune);
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void createDeviceToConfig(String device_name, String label_media, String archive_device){
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(Constant.getDevices(), true));
			bw.newLine();
			bw.write("Device {");
			bw.newLine();
			bw.write("  Name = "+device_name);
			bw.newLine();
			bw.write("  Media Type = File");
			bw.newLine();
			bw.write("  Archive Device = "+archive_device);
			bw.newLine();
			bw.write("  LabelMedia = "+label_media);
			bw.newLine();
			bw.write("  Random Access = yes;");
			bw.newLine();
			bw.write("  AutomaticMount = yes;");
			bw.newLine();
			bw.write("  RemovableMedia = no;");
			bw.newLine();
			bw.write("  AlwaysOpen = no;");
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void createFilesetToConfig(String fileset_name, String backup_folder_path, String exclude_folder_path,
			String signature, String compression){
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(Constant.getFilesets(), true));
			bw.newLine();
			bw.write("FileSet {");
			bw.newLine();
			bw.write("  Name = \""+fileset_name+"\"");
			bw.newLine();
			bw.write("  Include {");
			bw.newLine();
			bw.write("    Options {");
			bw.newLine();
			bw.write("      signature = "+signature);
			bw.newLine();
			if (!compression.equals("No compression")){
				bw.write("      compression = "+compression);
				bw.newLine();
			}
			bw.write("    }");
			bw.newLine();
			bw.write("    File = "+backup_folder_path);
			bw.newLine();
			bw.write("  }");
			bw.newLine();
			if(!exclude_folder_path.isEmpty()){
				bw.write("    Exclude { ");
				bw.newLine();
				bw.write("      File = "+exclude_folder_path);
				bw.newLine();
				bw.write("    }");
				bw.newLine();
			}
			bw.write("}");
			bw.newLine();
			bw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void createJobDefsToConfig(String jobdefs_name, String jobdefs_type, String level,
			String client, String fileset, String schedule, String storage, String pool, String priority){
		try {
			if(priority.length() == 0){
				priority = "10";
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(Constant.getJobdefs(), true));
			
			bw.newLine();
			bw.write("JobDefs {");
			bw.newLine();
			bw.write("  Name = \""+jobdefs_name+"\"");
			bw.newLine();
			bw.write("  Type = "+jobdefs_type);
			bw.newLine();
			bw.write("  Level = "+level);
			bw.newLine();
			bw.write("  Client = "+client);
			bw.newLine();
			bw.write("  FileSet = \""+fileset+"\"");
			bw.newLine();
			bw.write("  Schedule = \""+schedule+"\"");
			bw.newLine();
			bw.write("  Storage = "+storage);
			bw.newLine();
			bw.write("  Pool = "+pool);
			bw.newLine();
			bw.write("  Priority = "+priority);
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void createJobToConfig(String job_name, String job_type, String jobdefs, String client,
			String pool, String storage, String fileset, String schedule){
		try {
		
			BufferedWriter bw = new BufferedWriter(new FileWriter(Constant.getJobs(), true));
			bw.newLine();
			bw.write("Job {");
			bw.newLine();
			bw.write("  Name = \""+job_name+"\"");
			bw.newLine();
			bw.write("  Type = "+job_type);
			bw.newLine();
			bw.write("  JobDefs = "+jobdefs);
			bw.newLine();
			bw.write("  Client = "+client);
			bw.newLine();
			bw.write("  Pool = "+pool);
			bw.newLine();
			bw.write("  Storage = "+storage);
			bw.newLine();
			bw.write("  FileSet = "+fileset);
			bw.newLine();
			if(!schedule.equals("None")){
				bw.write("  Schedule = \""+schedule+"\"");
				bw.newLine();
			}
			bw.write("}");
			bw.newLine();
			bw.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void createPoolToConfig(String pool_name, String pool_type, String label_format,
			String volume_retention, String maximum_volume_bytes, String maximum_volumes, String recycle,
			String autoprune){
		try {

			if(label_format.length()==0){
				label_format = pool_name + "-${Year}${Month:p/2/0/r}${Day:p/2/0/r}";
			}
			if(volume_retention.length()==0){
				volume_retention = "365 days";
			}
			if(maximum_volume_bytes.length()==0){
				maximum_volume_bytes = "50G";
			}
			if(maximum_volumes.length()==0){
				maximum_volumes = "100";
			}

			BufferedWriter bw = new BufferedWriter(new FileWriter(Constant.getPools(), true));
			
			bw.newLine();
			bw.write("Pool {");
			bw.newLine();
			bw.write("  Name = "+pool_name);
			bw.newLine();
			bw.write("  Pool Type = "+pool_type);
			bw.newLine();
			bw.write("  Label format = \""+label_format+"\"");
			bw.newLine();
			bw.write("  Recycle = "+recycle);
			bw.newLine();
			bw.write("  AutoPrune = "+autoprune);
			bw.newLine();
			bw.write("  Volume Retention = "+volume_retention);
			bw.newLine();
			bw.write("  Maximum Volume Bytes = "+maximum_volume_bytes);
			bw.newLine();
			bw.write("  Maximum Volumes = "+maximum_volumes);
			bw.newLine();
			bw.write("}");
			bw.newLine();
			bw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void createStorageToConfig(String storage_name, String device, String ip_address){
		try {
		if(ip_address.length()==0){
			ip_address = Constant.getLocalhost_ip();
		}
		BufferedWriter bw;

		bw = new BufferedWriter(new FileWriter(Constant.getStorages(), true));
		bw.newLine();
		bw.write("Storage {");
		bw.newLine();
		bw.write("  Name = "+storage_name);
		bw.newLine();
		bw.write("  Address = "+ip_address);
		bw.newLine();
		bw.write("  SDPort = "+Constant.getSd_port());
		bw.newLine();
		bw.write("  Password = \""+Constant.getConfig_password()+"\"");
		bw.newLine();
		bw.write("  Device = "+device);
		bw.newLine();
		bw.write("  Media Type = File");
		bw.newLine();
		bw.write("}");
		bw.newLine();
		bw.close();
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	
}