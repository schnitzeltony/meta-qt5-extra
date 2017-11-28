SUMMARY = "Fast Math Parser Library"
HOMEPAGE = "http://beltoforion.de/article.php?a=muparser"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=7330c66af0fadfe6e8c17069e8e726f2"

SRC_URI = "git://github.com/beltoforion/muparser.git"
SRCREV = "57e7e28614579eafe061dba1f77acc855640882d"
S = "${WORKDIR}/git"

inherit autotools pkgconfig

EXTRA_OECONF = "--enable-samples=no"
