SUMMARY = "The SoX Resampler library"
HOMEPAGE = "https://sourceforge.net/projects/soxr/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENCE;md5=1f6605fc6dfe53a780959dfef7061f77"

inherit cmake

SRC_URI = "http://downloads.sourceforge.net/${BPN}/${BPN}-${PV}-Source.tar.xz"
SRC_URI[md5sum] = "3f16f4dcb35b471682d4321eda6f6c08"
SRC_URI[sha256sum] = "b111c15fdc8c029989330ff559184198c161100a59312f5dc19ddeb9b5a15889"

S = "${WORKDIR}/${BPN}-${PV}-Source"

EXTRA_OECMAKE += " \
    -DCMAKE_BUILD_TYPE=RelWithDebInfo \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"
