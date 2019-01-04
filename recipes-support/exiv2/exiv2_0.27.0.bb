SUMMARY = "Exif, Iptc and XMP metadata manipulation library and tools"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=625f055f41728f84a8d7938acc35bdc2"

DEPENDS = "zlib expat"

SRC_URI = " \
    http://www.exiv2.org/builds/${BPN}-${PV}-Source.tar.gz \
"
SRC_URI[md5sum] = "57d58c9cef127c5fa24bf0e1fbbd1f8c"
SRC_URI[sha256sum] = "ee88bc81539b73c65010651785d094fad0b39760a424b3c16c17e1856cfef2d7"

inherit cmake gettext

S = "${WORKDIR}/${BPN}-${PV}-Source"

INSANE_SKIP_${PN} = "useless-rpaths"

EXTRA_OECMAKE_append = " -DTHREADS_PTHREAD_ARG=OFF "

do_install_prepend() {
    install -d ${D}${mandir}
}

