SUMMARY = "Xapian is an Open Source Search Engine Library"
HOMEPAGE = "http://xapian.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

SRC_URI = "http://oligarchy.co.uk/xapian/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "5308261e78337604bd8f845dd6b4aafc"
SRC_URI[sha256sum] = "10584f57112aa5e9c0e8a89e251aecbf7c582097638bfee79c1fe39a8b6a6477"

inherit autotools cmake_lib

DEPENDS = "util-linux zlib"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "xapian, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "xapian, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN}-dev += "${libdir}/cmake"
