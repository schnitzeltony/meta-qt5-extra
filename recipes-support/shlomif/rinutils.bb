SUMMARY = "C11 / gnu11 utilities C library by Shlomi Fish / Rindolf"
HOMEPAGE = "https://github.com/shlomif/rinutils"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=93a02b264605b1fd19838fde65a7ed37"

SRC_URI = "git://github.com/shlomif/rinutils.git"
SRCREV = "63c9a72554e2a2afc46823a21e59a3399f461d00"
PV = "0.8.0"
S = "${WORKDIR}/git"

inherit cmake
