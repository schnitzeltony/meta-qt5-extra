SUMMARY = "Fast Math Parser Library"
HOMEPAGE = "http://beltoforion.de/article.php?a=muparser"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://License.txt;md5=98f3ad1a0193387fc84b0101833605c8"

SRC_URI = "git://github.com/beltoforion/muparser.git;branch=master;protocol=https"
SRCREV = "207d5b77c05c9111ff51ab91082701221220c477"
PV = "2.3.2"
S = "${WORKDIR}/git"

inherit cmake pkgconfig

EXTRA_OECMAKE = "-DENABLE_SAMPLES=OFF"
