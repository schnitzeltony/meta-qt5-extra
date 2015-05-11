SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "41fae11fcb7e469dff398c43e29f7577"
SRC_URI[sha256sum] = "b133f209c71ed0d33f81ab19a790e84ee66199f3ccb64156ef2f75ce6fc75cb2"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5XmlRpcClient, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5XmlRpcClient, -S${includedir}, -S${STAGING_INCDIR}"


