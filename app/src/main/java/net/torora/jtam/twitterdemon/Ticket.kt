package net.torora.jtam.twitterdemon

/**
 * Created by jtam on 12/16/17.
 */
class Ticket {
    var tweetID:String?=null
    var tweetText:String?=null
    var tweetImageURL:String?=null
    var tweetPersonUID:String?=null
    constructor(tweetID:String,tweetText:String,tweetImageURL:String,tweetPersonUID:String){
        this.tweetID=tweetID
        this.tweetText=tweetText
        this.tweetImageURL=tweetImageURL
        this.tweetPersonUID=tweetPersonUID
    }
}