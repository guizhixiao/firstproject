自定义模板说明：

    在使用过程中，为了方面操作，只定义一少部分的指令：
    在该指令中：[XX] 所有的需要替换的值的样式
    制定一些默认使用的字符：
    [package] :表示包
    [class] : 表示类  只输入类的前缀
    [RequestMapping]: 
    
    定义其他指令：
    [capX][/capX] 首字母大写
    [capx][/capx] 首字母小写
    [Utoxline][/Utoxline] 大写字母转换成小写和下划线
    [utoXline][/utoXline] 小写字母转换成大写和下划线
    
    循环指令：[for]###[params]### 需要循环的数据[/for]
        说明：定义该for循环只可以在一句中执行，而不可以在多句中同时执行，
        说明： 若Arrays是基本的数据类型，例如List<String> 则直接使用[value] 添加数据
              若Arrays中的数据是Map类型，则已key作为数据的[key] 表示，值使用map.get(key)代替
              若Arrays是TempEntity的子类，
                在biz中直接使用field 代替name ,fieldValue 代替value
         [for]###Arrays###@ApiImplicitParam(name = "id",value = "id"),[/for]