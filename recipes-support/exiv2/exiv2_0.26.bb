SUMMARY = "Exif, Iptc and XMP metadata manipulation library and tools"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=625f055f41728f84a8d7938acc35bdc2"

DEPENDS = "zlib expat"

SRC_URI = " \
    http://www.exiv2.org/releases/${BPN}-${PV}-trunk.tar.gz \
    file://exiv2-CVE-2017-17723.patch \
    file://exiv2-wrong-brackets.patch \
    file://exiv2-CVE-2017-11683.patch \
    file://exiv2-CVE-2017-14860.patch \
    file://exiv2-CVE-2017-14864-CVE-2017-14862-CVE-2017-14859.patch \
    file://exiv2-CVE-2017-17725.patch \
    file://exiv2-CVE-2017-17669.patch \
    file://exiv2-additional-security-fixes.patch \
    file://exiv2-CVE-2018-10958.patch \
    file://exiv2-CVE-2018-10998.patch \
    file://exiv2-CVE-2018-11531.patch \
    file://exiv2-CVE-2018-12264-CVE-2018-12265.patch \
    file://exiv2-CVE-2018-14046.patch \
    file://exiv2-CVE-2018-5772.patch \
    file://exiv2-CVE-2018-8976.patch \
    file://exiv2-CVE-2018-8977.patch \
"
SRC_URI[md5sum] = "5399e3b570d7f9205f0e76d47582da4c"
SRC_URI[sha256sum] = "c75e3c4a0811bf700d92c82319373b7a825a2331c12b8b37d41eb58e4f18eafb"

inherit cmake gettext

S = "${WORKDIR}/${BPN}-trunk"

INSANE_SKIP_${PN} = "useless-rpaths"

EXTRA_OECMAKE_append = " -DTHREADS_PTHREAD_ARG=OFF "
