SUMMARY = "Fast Math Parser Library"
HOMEPAGE = "http://beltoforion.de/article.php?a=muparser"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=7330c66af0fadfe6e8c17069e8e726f2"

SRC_URI = "https://github.com/beltoforion/${BPN}/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "02dae671aa5ad955fdcbcd3fee313fb7"
SRC_URI[sha256sum] = "0666ef55da72c3e356ca85b6a0084d56b05dd740c3c21d26d372085aa2c6e708"

inherit autotools pkgconfig

EXTRA_OECONF = "--enable-samples=no"
