package com.watayouxiang.common;

import com.watayouxiang.demoshell.tool.MdFileData;
import com.watayouxiang.demoshell.tool.MdFileTool;

// README.md 文件生成器
public class MDProducer_MyDocument {

    public static void main(String[] args) {
        new MdFileTool().start(new MdFileData() {
            @Override
            public String getInDirPath() {
                return Const.myDocument_inDir;
            }

            @Override
            public String getOutFilePath() {
                return Const.myDocument_outFile;
            }

            @Override
            public String getProjectUrl() {
                return Const.github_url;
            }
        });
    }

}