SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "168f6a5e91bf3a780d1a4beb6e4c8b4a"
SRC_URI[sha256sum] = "8fd3c83415467cbc3b3cafa0f7867d4bbdbd98f34e3617df74cf31f003cef2c5"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5XmlRpcClient, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5XmlRpcClient, -S${includedir}, -S${STAGING_INCDIR}"


