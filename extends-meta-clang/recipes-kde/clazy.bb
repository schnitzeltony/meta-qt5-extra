SUMMARY = "Qt oriented code checker based on clang framework"
HOMEPAGE = "http://gottcode.org/hexalate/"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING-LGPL2.txt;md5=d31701979430eba03ad0eac6e517dec3"

DEPENDS = "clang"

inherit kde-base

PV = "1.11"
SRC_URI += "file://0001-clazy-no-rpath.patch"
SRC_URI[sha256sum] = "66165df33be8785218720c8947aa9099bae6d06c90b1501953d9f95fdfa0120a"

EXTRA_OECMAKE += " \
    -DREGEX_RUN_RESULT=0 \
    -DFILESYSTEM_RUN_RESULT=0 \
    -DFILESYSTEM_RUN_RESULT__TRYRUN_OUTPUT=0 \
"

FILES:${PN} += "${libdir}/ClazyPlugin.so"

BBCLASSEXTEND += "native nativesdk"
