SUMMARY = "Interaction with XMLRPC services"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://COPYING.BSD;md5=5c262c13b60ebefe3060aed37d334ab6 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n kio"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "1506887fea60047aea44db4e83015c1c"
SRC_URI[sha256sum] = "308df80a9569a10480af0d4c7d5fdf7689b947e31da50ebf69d17fecc572eda1"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5XmlRpcClient, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5XmlRpcClient, -S${includedir}, -S${STAGING_INCDIR}"


