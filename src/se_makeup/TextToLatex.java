/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_makeup;

/**
 *
 * @author Hammad
 */

public class TextToLatex {

    private static String latex;
    private String paperSize;

    TextToLatex(String paperSize) {
        this.paperSize = paperSize;
    }

    TextToLatex() {
    }

    public String initializeDoc() {
        latex = "\\documentclass[" + paperSize + "]{article}\n"
                + "\n"
                + "\\usepackage[english]{babel}\n"
                + "\\usepackage[utf8]{inputenc}\n"
                + "\\usepackage{amsmath}\n"
                + "\\usepackage{graphicx}\n"
                + "\\usepackage[colorinlistoftodos]{todonotes}\n"
                + "\\usepackage[obeyspaces]{url}\n"
                + "%\\usepackage{hyperref}\n"
                + "\n"
                + "\\usepackage{setspace}\n"
                + "\\usepackage{listings}\n"
                + "\\usepackage{xcolor}\n"
                + "\n"
                + "\\definecolor{codegreen}{rgb}{0,0.6,0}\n"
                + "\\definecolor{codeblue}{rgb}{0,0,0.6}\n"
                + "\\definecolor{codegray}{rgb}{0.5,0.5,0.5}\n"
                + "\\definecolor{codepurple}{rgb}{0.58,0,0.82}\n"
                + "\\definecolor{backcolour}{rgb}{0.95,0.95,0.92}\n"
                + "\n"
                + "\\lstset{language=Java,\n"
                + "	backgroundcolor=\\color{backcolour},\n"
                + "	backgroundcolor=\\color{backcolour},   \n"
                + "	commentstyle=\\color{codegreen},\n"
                + "	keywordstyle=\\color{magenta},\n"
                + "	numberstyle=\\tiny\\color{codegray},\n"
                + "	stringstyle=\\color{codepurple},\n"
                + "	basicstyle=\\ttfamily\\footnotesize,\n"
                + "	breakatwhitespace=false,         \n"
                + "	breaklines=true,                 \n"
                + "	captionpos=b,                    \n"
                + "	keepspaces=true,                 \n"
                + "	numbers=left,                    \n"
                + "	numbersep=5pt,                  \n"
                + "	showspaces=false,                \n"
                + "	showstringspaces=false,\n"
                + "	showtabs=false,                  \n"
                + "	tabsize=2}";
        return latex;
    }

    public String titleAndSubtitleToTex(String title, String subtitle) {
        String texTitle = "\n\\title{" + title + "\\\\ \\vspace{5mm}\n"
                + "	\\large " + subtitle + "}";
        return texTitle;
    }

    public String authorAndMailToTex(String author, String mail) {
        String texAuthor = "\n\\author{" + author + "} %\\\\ E-mail: \\href{mailto:" + mail + "}{" + mail + "}}";
        return texAuthor;
    }

    public String dateToTex(String date) {
        String texDate = "\n\\date{" + date + "}";
        return texDate;
    }

    public String sectionToTex(String section) {
        String texSection = "\n\\section{" + section + "}";
        return texSection;
    }

    public String subsectionToTex(String subsection) {
        String texSubsection = "\n\\subsection{" + subsection + "}";
        return texSubsection;
    }

    public String textToTex(String text) {
        String texText = text;
        return "\n" + texText;
    }

    public String pathToTex(String path) {
        String texPath = "\n\\path{" + path + "}";
        return texPath;
    }

    public String codeToTex(String language, String caption, String code) {
        String texCode = "\n\\begin{lstlisting}[language=" + language + "]%, caption=" + caption + " example]\n"
                + "	\n"
                + code + "\n"
                + "\\end{lstlisting}";
        return texCode;
    }

    public String listToTex(String list) {
        String texList = "\n\\begin{enumerate}\n"
                + list + "\n"
                + "\\end{enumerate}";
        return texList;
    }

    public String linkToTex(String link) {
        String texLink = "\n\\url{" + link + "}";
        return texLink;
    }

    public String getLatex() {
        return latex;
    }
    public void setLatex(String code) {
        latex=code;
    }
    public void appendToLatex(String append){
        latex+=append;

    }

    public String getPapersize() {
        return paperSize;
    }

}
