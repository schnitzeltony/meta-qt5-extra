SUMMARY = "Extended Module Player Library"
HOMEPAGE = "http://xmp.sourceforge.net/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://README;beginline=59;md5=9cee4cd08e9762f4a8fda61cb39d430d"

inherit autotools-brokensep pkgconfig

SRC_URI = "${SOURCEFORGE_MIRROR}/project/xmp/${BPN}/${PV}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3a2afcbbb720fb2931e79aeb66e724f7"
SRC_URI[sha256sum] = "353535cc84c8cddae8decec4e65fa4c51fc64f22eb0891bc3dae6eaf25f9cccf"
