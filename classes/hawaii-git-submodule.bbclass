# Some maui packages drag in code from other git-repositories by submodules. 
# Have a class to this job for us.

addtask sync_submodules before do_patch after do_unpack

do_sync_submodules() {
    git submodule update --init
}
