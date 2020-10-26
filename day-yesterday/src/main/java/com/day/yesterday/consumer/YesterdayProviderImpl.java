package com.day.yesterday.consumer;

import com.day.api.provider.YesterdayProvider;
import org.apache.dubbo.config.annotation.DubboService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * explain:
 * </p>
 *
 * @author wangjunming
 * @since 2020/10/23 17:23
 */
@DubboService
public class YesterdayProviderImpl implements YesterdayProvider {

    @Override
    public String getYesterDayTime() {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
}
