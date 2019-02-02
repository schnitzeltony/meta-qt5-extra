SUMMARY = "Fast Math Parser Library"
HOMEPAGE = "http://beltoforion.de/article.php?a=muparser"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=630a76659803db4be41fa4ce5be5ca16"

SRC_URI = "git://github.com/beltoforion/muparser.git"
SRCREV = "b7511e19027296af06265bac5db7ed7a36037737"
S = "${WORKDIR}/git"

inherit cmake pkgconfig

EXTRA_OECMAKE = "-DENABLE_SAMPLES=OFF"
