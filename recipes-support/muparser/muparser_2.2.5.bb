SUMMARY = "Fast Math Parser Library"
HOMEPAGE = "http://beltoforion.de/article.php?a=muparser"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=630a76659803db4be41fa4ce5be5ca16"

SRC_URI = "git://github.com/beltoforion/muparser.git"
SRCREV = "33dcf471d40f15cb86d9307328dc8f9e875a5202"
S = "${WORKDIR}/git"

inherit cmake pkgconfig

EXTRA_OECMAKE = "-DENABLE_SAMPLES=OFF"
