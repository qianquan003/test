package com.xi.jms;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;

import com.xi.util.SendMail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Resource
    JmsTemplate jmsTemplate;

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "home";
    }

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String send(Locale locale, Model model) {
        /**
         * send mapMessage
         */
        Map map = new HashMap();
        Map<String,Object> obj =new HashMap<String,Object>();
        String subject="subject";
        obj.put("subject",subject);
        String content="我88年，老公90年，大学同学，家庭情况： 都是标准穷二代，就是父母不可能给我们任何资助，我们还得时刻想着父母是否缺钱花的那种。事业情况：毕业后在上海，在外企做IT,收入情况：我税后11k每月,老公税后13k每月.另加上公积金我和老公都是每月各3千。对于我们收入认为是比上不足，比下有余，周围88年的税后比我多个几千的女孩大有人在，我在工作上并不出色，我也不认为自己有钱。周围90年的比老公工资高的也大有人在，当然人家基本是凭加班赢得的高工资，老公从不加班，所以我对他工资还是很满意。房贷情况：14年时，没有靠父母，我们凑首付上海郊区买了个房子，找朋友借的首付已经在15年3月已还清。房贷对我们不是压力，每月房贷7千，由于公积金共有6000，每月自己还1千即可。积蓄：12万。朋友圈：老公在外企的朋友圈貌似都是土豪，一个个都有能力的不得了有钱的不得了似的。公司有20元/顿标准的免费食堂，但他们一周两次出去吃，一次人均吃个盒饭都要七八十左右哪种。而我的朋友圈貌似都是吊丝，据说我们经理年薪有六十万，但是经常吃十几元盒饭，我的直接领导税后14k,但是用钱省的不行了，比方吃饭买衣总是捡便宜的。家庭环境的影响：我爸妈就是特别省钱特别精明，小时候我弄丢了十元钱的东西，记得我爸爸竟然骂了我一整天。我从小在做小生意家里长大，爸妈灌输思想是“不怕不识货，就怕货比货”，所以我买东西总要多逛逛，老公认为多逛逛不买纯碎是浪费时间。我爸妈在一起时，他们很少夸奖对方，经常为了一点小事一点小钱吵的很凶。老公爸妈也穷，家里种地，但是他们不是小气精明的人，不会为了一点点小事情责骂家人，我从来没见过我婆婆责骂她的两个儿子半点。婆婆老是自责自己没本事给。而我爸妈是时刻强调我要反哺。剧烈事件：1.有次买东西时，我讨价还价，老板是个老太太，直巴巴的找我老公按原价要钱，老公凶了我，说不知道听谁的。2，老公喜欢看电影，我认为电影院看电影一个月一次就够了，家里为了看电影特地买了投影仪，而我老公喜欢想看就看，一周一次最好。3.老公打羽毛球喜欢去收费场馆打，认为打的舒服些。我认为公园打就挺好。4.老公短途出门喜欢打车，我认为应该坐公交。因为家门口就有公交站，又不是没有车坐。5.之前有公司给老公提供税后18k的薪水，要经常加班，老公觉得没前途，拒绝了，选择了现在税后13k的，但是不加班，下班后可以自己创业的。好在老公和我很恩爱，大多数我们有分歧时，我选择听他的，他选择听我的。老公对我也不节约，之前要给我买了3千元的手表，我嫌贵拒绝了，过生日给我买了一千多的护肤品，平时喜欢带我逛街，几百元东西基本是随便我买。问题：担心我和老公的价值观会让我们有隔阂。想到的解决办法：我觉得老公消费观比我高是因为他生活感受压力小，家里房贷都是我在还，他的工资都是我在管，他只管花就行，从来不管家里钱有多少。我不把钱和他的放一起了。老公以后还想买市区的房，我让他自己去奋斗，我的钱我自己养自己就好。因为我是开玩笑的说，老公很开心的同意了。但是实际我没有这样做，总觉得夫妻钱分开影响两人感情。怎样才能使夫妻感情更稳固呢，是我的消费观不对?";
        obj.put("content",content);
        SendMail sm=new SendMail("157309341@qq.com",obj);
        sm.send();
        if(sm.send()){
            System.out.println(" send sucess");
            map.put("Name", content);
        }else{
            System.out.println("send fail");
        }

        jmsTemplate.convertAndSend(map);
        model.addAttribute("send", "sucess");
        return "home";
    }

    /**
     * receive jms message
     *
     * @param locale
     * @param model
     * @return
     */
    @RequestMapping(value = "/receive", method = RequestMethod.GET)
    public String test(Locale locale, Model model) {
        Message message = jmsTemplate.receive();
        if (message instanceof MapMessage) {
            final MapMessage mapMessage = (MapMessage) message;

            try {
                logger.info(mapMessage.getString("Name"));
                model.addAttribute("content", mapMessage.getString("Name"));
            } catch (JMSException e) {
                // do something
            }
        }

        return "receive";
    }

}
