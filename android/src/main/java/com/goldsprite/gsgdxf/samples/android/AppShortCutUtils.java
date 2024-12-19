package com.goldsprite.gsgdxf.samples.android;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AppShortCutUtils {
	public static String shortcut_id_noHideBlackBar = "noHideBlackBar";
	public static String shortcut_id_hideBlackBar = "hideBlackBar";

	public static void createShortcut(Activity activity) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
			ShortcutManager shortcutManager = activity.getSystemService(ShortcutManager.class);
			List<ShortcutInfo> shortCutsList = new ArrayList<>();
			//无隐藏黑条
			{
				// 创建快捷方式的 Intent
				Intent shortcutIntent = new Intent(Intent.ACTION_VIEW);
				shortcutIntent.setClassName(activity.getPackageName(), AndroidGdxLauncher.class.getName());
				shortcutIntent.putExtra("isHideBlackBar", false);
				shortcutIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);//启动新任务且如果有其他任务堆栈则清除
				// 创建快捷方式的图标
				Icon icon = Icon.createWithResource(activity, R.drawable.ic_shortcut);
				// 创建快捷方式的对象
				ShortcutInfo shortcut = new ShortcutInfo.Builder(activity, shortcut_id_noHideBlackBar)
					.setShortLabel("无隐藏黑条")
					.setLongLabel("无隐藏黑条")
					.setIcon(icon)
					.setIntent(shortcutIntent)
					.build();
				shortCutsList.add(shortcut);
			}
			//隐藏黑条启动快捷方式
			{
				// 创建快捷方式的 Intent
				Intent shortcutIntent = new Intent(Intent.ACTION_VIEW);
				shortcutIntent.setClassName(activity.getPackageName(), AndroidGdxLauncher.class.getName());
				shortcutIntent.putExtra("isHideBlackBar", true);
				shortcutIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);//启动新任务且如果有其他任务堆栈则清除
				// 创建快捷方式的图标
				Icon icon = Icon.createWithResource(activity, R.drawable.ic_shortcut);
				// 创建快捷方式的对象
				ShortcutInfo shortcut = new ShortcutInfo.Builder(activity, shortcut_id_hideBlackBar)
					.setShortLabel("隐藏黑条")
					.setLongLabel("隐藏黑条")
					.setIcon(icon)
					.setIntent(shortcutIntent)
					.build();
				shortCutsList.add(shortcut);
			}
			// 添加快捷方式
			shortcutManager.setDynamicShortcuts(shortCutsList);
		} else {
			Toast.makeText(activity, "您的设备不支持此功能: createAppShortCuts", Toast.LENGTH_SHORT).show();
		}
	}
}
