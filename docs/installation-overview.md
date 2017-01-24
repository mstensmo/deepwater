## Installation Overview

This section provides a high-level description of the installation process. 

The image below is a conceptual stack of software that is installed and required for deep water. 

![Installation Stack](images/installation_stack.jpg)

- Setup and Utilities. At the beginning of installation steps, recommended folders will be made for organizational purposes. A clean update of packages is made and a system reboot to apply those updates. Then, utilities for the installation process are installed.

- Deep Water Build. All the above installation steps are simply pre-requisites to use or build Deep Water. Building Deep Water, involves clone the source code and building the various backends. The output of this step will be a JAR file that will be consumed by H2O core. Also, for each backend, the any client (Python or R) API module or package must be installed.


### Installation Paths and Stack

Various installation paths allow for certain scenarios and support different use cases.

1. Limit privilege access

   Separating system-wide and user-specific instllation steps will follow the best practice of limiting administrative previliges.
   

   Installing the minimum required artifacts system-wide (with administrative previleges) and leaving the rest for individual user installation also allows for customization of the installation per user.
   
   ![Installation Paths](images/installation-paths.jpg)

### S3 Bucket

Installation artifacts are stored on S3 at in the bucket h2o-deepwater. The bucket hierarchy is shown in the image below.

![S3 Bucket](images/s3-bucket.png)

At the top level, there are three namespaces: **internal**, **release**, and **public**. 

The internal namespace is private to H2O.ai and is used to store artifacts that should only be used by internal H2O.ai personnel. This can included experimental/development builds, third-party artifacts typically requiring registration, or just a backup repository for artifacts. Within the internal namespace are other namespaces to help organize artifacts:

The public namespace is public and is used to store artifacts that might be useful for public consumption, but not necessarily part of an ocial build. They may include datasets, development builds, or other useful artifacts.

### Installation Use Cases

How you progress through the installation can change depending on what your end goal is. The following




### Infrastructure

While these instructions were designed for and validated on AWS EC2 GPU instances, they may work for other machines (virtual or otherwise).

#### Amazon Web Services EC2 Instances
  - g2.2xlarge Instance
     * Intel Sandy Bridge processor running at 2.6 GHz with Turbo Boost enabled, 8 vCPUs (Virtual CPUs)
     * 15 GiB of RAM
     * 60 GB of SSD storage
	  * 8 NVIDIA Tesla K80 Accelerators, each running a pair of NVIDIA GK210 GPUs.

##### Provisioning an EC2 Instance

1. Choose a base AMI. For example:

	![Base AMI](images/base-ami.jpg)

	* Ubunto Server 16.04 LTS (HVM) AMI
	  
	  * US East 1 (N. Virginia) Region AMI ID: ami-e13739f6
	  * US West 2 (Oregon) Region AMI ID: ami-b7a114d7

2. Choose an instance type:

   ![Instance Type](images/instance-type.jpg)

3. Add storage:

   ![Add Storage](images/add-storage.jpg)
   
4. Configure Security Group:

   ![Configure Security Group](images/configure-security-group.jpg)
   
   For example:
   
   * Refer existing group (N. Virginia region): deepwater-v4

5. Add tags:

   ![Add Tags](images/add-tags.jpg)

6. Review the instance and then launch.

   ![Review and Launch](images/review-and-launch.jpg)

#### GPUs


	$ lspci -nn | grep -i VGA -A 12

### Files and Versions

* CUDA: cuda 8.0.44 linux.run