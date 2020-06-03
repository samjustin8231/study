package com.example.designpattern.behavior.state.case2;

/**
 * 类的实现描述：任务状态枚举类
 *
 * @author sunyajun 2019/2/28 2:13 PM
 */
public enum TaskStatusEnum {

	TASK_STATUS_INPUT_UNRECEIVED("1", "录入未领取", "taskInputUnReceivedStatusHandler"),
	TASK_STATUS_INPUT_TO_PROCESSED("2", "待处理", "taskInputToProcessStatusHandler"),
	TASK_STATUS_INPUT_PROCESSING("3", "处理中", "taskInputProcessingStatusHandler"),
	TASK_STATUS_REVIEW_UNRECEIVED("4", "复核未领取", "taskReviewUnReceivedStatusHandler"),
	TASK_STATUS_REVIEW_TO_CHECK("5", "待复核", "taskReviewToCheckStatusHandler"),
	TASK_STATUS_REVIEW_CHECKING("6", "复核中", "taskReviewCheckingStatusHandler"),
	TASK_STATUS_GUANG_UP("7", "挂起", "taskHangUpStatusHandler"),
	TASK_STATUS_GO_BACK("8", "退回", "taskGoBackStatusHandler"),
	TASK_STATUS_IS_DONE("9", "已完成", "taskIsDoneStatusHandler");

	private String code;
	private String name;
	private String desc;

	private TaskStatusEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	TaskStatusEnum(String code, String name, String desc) {
		this.code = code;
		this.name = name;
		this.desc = desc;
	}

	public static String getName(String code) {
		for (TaskStatusEnum taskStatusEnum : TaskStatusEnum.values()) {
			if (taskStatusEnum.getCode().equals(code)) {
				return taskStatusEnum.getName();
			}
		}
		return null;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
