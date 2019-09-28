package com.example.demo.controller;

import com.example.demo.socket.WebSocketServer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * YY
 *
 * @author
 * @since JDK1.8
 */
@RestController
@RequestMapping("/checkcenter")
public class CheckCenterController {

    //推送数据接口
    @ResponseBody
    @RequestMapping("/socket/push/{cid}")
    public String pushToWeb(@PathVariable String cid, String message) {
        try {
            WebSocketServer.sendInfo(message, cid);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cid;
    }
}
