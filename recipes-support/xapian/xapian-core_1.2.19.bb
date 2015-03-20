SUMMARY = "Xapian is an Open Source Search Engine Library"
HOMEPAGE = "http://xapian.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

SRC_URI = "http://oligarchy.co.uk/xapian/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "54ec8333757eb94dbde76d31d185af91"
SRC_URI[sha256sum] = "4a78260388ff1b042f0ab5d18afdd524a530ae609690d0339990ddc147a54785"

inherit autotools cmake-lib

DEPENDS = "util-linux zlib"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "xapian, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "xapian, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN}-dev += "${libdir}/cmake"
