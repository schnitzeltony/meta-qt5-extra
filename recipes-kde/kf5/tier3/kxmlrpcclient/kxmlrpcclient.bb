SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c5ae8477840ab1c93635dcc08910c65c"
SRC_URI[sha256sum] = "9a1db5fa2fcd87e55ac74e0ea8c05e4ddd83bcef68a471749bd63271966147fe"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5XmlRpcClient, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5XmlRpcClient, -S${includedir}, -S${STAGING_INCDIR}"


